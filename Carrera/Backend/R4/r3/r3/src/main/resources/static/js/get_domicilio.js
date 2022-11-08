window.addEventListener('load', function () {
    (function(){
      const url = '/pacientes';
      const settings = {
        method: 'GET'
      }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
       for(paciente of data){
               var table = document.getElementById("pacienteTable");
               var odontologoRow =table.insertRow();
               let tr_id = 'tr_' + domicilio.id;
               pacienteRow.id = tr_id;

            pacienteRow.innerHTML = '<td class=\"td_calle\">' + domicilio.calle.toUpperCase() + '</td>' +
                    '<td class=\"td_numero\">' + domicilio.numero.toUpperCase() + '</td>' + '<td class=\"td_localidad\">' + domicilio.localidad.toUpperCase() +
                    '</td>' + '<td class=\"td_provincia\">' + domicilio.provincia.toUpperCase();

        };

    })
    })

    (function(){
      let pathname = window.location.pathname;
      if (pathname == "/pacienteList.html") {
          document.querySelector(".nav .nav-item a:last").addClass("active");
      }
    })


    })