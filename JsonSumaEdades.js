var arreglojson = [{
    nombre: 'stalin',
    edad: 21
}, {
    nombre: 'carlos',
    edad: 23
}, {
    nombre: 'karla',
    edad: 20
}, {
    nombre: 'anapaula',
    edad: 27
}, {
    nombre: 'javier',
    edad: 26
}];
console.log(arreglojson[1].edad);
var suma = 0;
for (let index = 0; index < arreglojson.length; index++) {
    var element = arreglojson[index].edad;
    suma = suma + element;
};
console.log(suma);