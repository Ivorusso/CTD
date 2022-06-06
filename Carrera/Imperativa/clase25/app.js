const mascota = {
    nombre: 'Zeus',
    salud: 70,
    edad: 0,
    hambre: 50,
    suenio: 25,

    estado: function () {
        console.log(`Nombre: ${this.nombre}, Salud: ${this.salud}, Edad: ${this.edad}, Hambre: ${this.hambre}.`);
    },

    crecimiento: function () {
        this.edad += 1;
        this.salud -= 30;
        this.hambre += 15;
        this.suenio += 30;
    },

    sigueConVida: function () {
        return this.salud > 0 && this.salud <= 100 && this.hambre >= 0 && this.hambre <= 80 && this.suenio > 0
    },

    comer: function () {
        this.hambre -= 10;
        this.salud += 15
    },

    descanso: function () {
        this.salud += 5;
        this.suenio -= 20;
    },

    pasear: function () {
        this.hambre +=10;
        this.salud +=15;
        this.suenio +=10;
    }
}
module.exports = mascota;
