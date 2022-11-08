function contenido(params) {
    let conts = [
        React.createElement('h1', null, 'Con lo visto hasta ahora'),
        React.createElement('h2', null, 'Replica este HTML'),
        React.createElement('h3', null, 'Usando'),
        React.createElement('h4', null, 'React.Js'),
        React.createElement('footer', null, 'Suerte!'),
    ];
    return conts
}


ReactDOM.render(
    contenido(),
    document.getElementById('root')
  )
