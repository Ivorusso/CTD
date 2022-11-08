window.addEventListener('load', function () {
    (function(){
      const url = '/turnos';
      const settings = {
        method: 'GET'
      }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
         for(turnos of data){
            var table = document.getElementById("turnosTable");
            var turnosRow =table.insertRow();
            let tr_id = 'tr_' + turnos.id;
            turnosRow.id = tr_id;
            turnosRow.innerHTML = '<td class=\"td_nombre\">' + turnos.nombre.toUpperCase() + '</td>' +
                    '<td class=\"td_apellido\">' + turnos.apellido.toUpperCase() + '</td>';

        };

    })
    })

    (function(){
      let pathname = window.location.pathname;
      if (pathname == "/turnos.html") {
          document.querySelector(".nav .nav-item a:last").addClass("active");
      }
    })


    })