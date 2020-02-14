const moment=require('moment')
moment.locale('es');
var fecha = new Date();
console.log(fecha);
console.log(fecha.getDate());
console.log(fecha.getDay());
console.log(fecha.getMonth());
console.log(fecha.getFullYear());
console.log(moment().format('dddd'));

const horaActual=moment().format('hh,mm,ss')
console.log(horaActual);
console.log(moment().add(3,'hours').toString());

console.log(fecha.toISOString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());

console.log(moment().toObject()['years']);