import React, { useState } from 'react'
const Formexample = () => {

    const [user, setUser] = useState({
      name: '',
      edad: '',
      pokefav: ''
    })
  
    const handleSubmit = (e) => {
        alert('Te Regitrate re piola pa')
    }
  
    return (
      <>
        <form onSubmit={handleSubmit}>
          <label>Nombre</label>
          <input type="text" onChange={(e) => setUser({...user, name: e.target.value})}/>
          <label>Edad</label>
          <input type="number" onChange={(e) => setUser({...user, edad: e.target.value})}/>
          <label>Pokemon Favorito</label>
          <input type="text" onChange={(e) => setUser({...user, pokefav: e.target.value})}/>
          <button>Registrarse</button>
        </form>
  
        <h3>Nombre: {user.name}</h3>
        <h3>Edad: {user.edad}</h3>
        <h3>Pokemon Favorito: {user.pokefav}</h3>
      </>
    )
  }
  
  export default Formexample
