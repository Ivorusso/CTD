window.addEventListener("load", function () {
  const formulario = document.querySelector("#add_new_turno");

  formulario.addEventListener("submit", function (event) {
    const selectedValueOdoStr = document.getElementById("odontologoSelect").value;
    const selectedValueOdo = JSON.parse(selectedValueOdoStr);

    const selectedValuePacStr = document.getElementById("pacienteSelect").value;
    const selectedValuePac = JSON.parse(selectedValuePacStr);

    const formData = {
      localDate: document.querySelector("#fecha").value,
      paciente: {
        id: selectedValuePac.id,
        nombre: selectedValuePac.nombre,
        apellido: selectedValuePac.apellido,
        dni: selectedValuePac.dni,
        domicilio: {
          id: selectedValuePac.domicilio.id,
          calle: selectedValuePac.domicilio.calle,
          numero: selectedValuePac.domicilio.numero,
          localidad: selectedValuePac.domicilio.localidad,
          provincia: selectedValuePac.domicilio.provincia,
        },
      },
      odontologo: {
        id: selectedValueOdo.id,
        nombre: selectedValueOdo.nombre,
        apellido: selectedValueOdo.apellido,
        matricula: selectedValueOdo.matricula,
      },
    };

    const url = "/turnos";
    const settings = {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(formData),
    };

    fetch(url, settings)
      .then((response) => response.json())
      .then((data) => {
        let successAlert =
          '<div class="alert alert-success alert-dismissible">' +
          '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
          "<strong></strong> paciente agregado </div>";
        document.querySelector("#response").innerHTML = successAlert;
        document.querySelector("#response").style.display = "block";
        resetUploadForm();
      })
      .catch((error) => {
        let errorAlert =
          '<div class="alert alert-danger alert-dismissible">' +
          '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
          "<strong> Error intente nuevamente</strong> </div>";

        document.querySelector("#response").innerHTML = errorAlert;
        document.querySelector("#response").style.display = "block";
        resetUploadForm();
      });
  });

  function resetUploadForm() {
    document.querySelector("#fecha").value = "";
  }

  (function () {
    let pathname = window.location.pathname;
    if (pathname === "/") {
      document.querySelector(".nav .nav-item a:first").addClass("active");
    } else if (pathname == "/turnosList.html") {
      document.querySelector(".nav .nav-item a:last").addClass("active");
    }
  })();
});

window.addEventListener("load", function () {
  (function () {
    const url = "/odontologos";
    const settings = {
      method: "GET",
    };
    fetch(url, settings)
      .then((response) => response.json())
      .then((data) => {
        for (odontologo of data) {
          const select = document.getElementById("odontologoSelect");
          select.innerHTML += `<option id=${odontologo.id} value= ${JSON.stringify(odontologo)}> ${odontologo.nombre} ${odontologo.apellido}</option>`;
        }
      });
  })(function () {
    let pathname = window.location.pathname;
    if (pathname == "/turnos.html") {
      document.querySelector(".nav .nav-item a:last").addClass("active");
    }
  });
});

window.addEventListener("load", function () {
  (function () {
    const url = "/pacientes";
    const settings = {
      method: "GET",
    };
    fetch(url, settings)
      .then((response) => response.json())
      .then((data) => {
        for (paciente of data) {
          console.log(data);
          console.log(paciente)
          const select = document.getElementById("pacienteSelect");
          select.innerHTML += `<option id=${paciente.id} value= ${JSON.stringify(paciente)}> ${paciente.nombre} ${paciente.apellido} </option>`;
        }
      });
  })(function () {
    let pathname = window.location.pathname;
    if (pathname == "/turnos.html") {
      document.querySelector(".nav .nav-item a:last").addClass("active");
    }
  });
});

