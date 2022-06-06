const FS = require('fs')



const jsonAutos = JSON.stringify("./AUTOS.json")
FS.writeFileSync("./AUTOS.json")
