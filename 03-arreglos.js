var arreglo = [1, 2, 3, 4, 5,]
var palabraString = 'stalin';
var arregloPalabra = palabraString.split('');
console.log(arregloPalabra.reverse());

console.log(arreglo.length);
arreglo.push(6);

for (let index = 0; index){

}
console.log(arreglo.length);
arreglo.pop();

console.log(arreglo[3]);
console.log(arreglo.slice(2, 4));
console.log(arreglo.shift());
console.log(arreglo.reverse());

console.log(arreglo);
var arregloDividido = arreglo.slice(2,5);
console.log(arregloDividido);
arreglo.splice(0,1);
console.log(arreglo);

arregloPalabra.forEach((elemnto,indice)=>{
    console.log(aaa,i);
});
 var arregloMutado = map((elemento,indice)=>{
    return elemento + 1;
}).forEach((e,i)=>{
    console.log(e);
}).map((e)=>{
    return e -1;
})


console.log(arregloMutado);
var arregloX2 = arreglo.forEach(elemento,indice=>{

})

var metodoSome =arreglo.every((e,i)=>{
    return e ==2;
});
console.log(metodoSome);
 var metodoFilter = arreglo.filter((elemento,indice)=>{
     return  elemento ==2;
 });
 console.log(metodoFilter);

 var  arregloJson=[
 {
     nombre:'asddf',
     edad:123
 },
 {nombre:'asdf',edad:1},
 {
     nombre:'asds',
     edad:121
 },
 {nombre:'assd',edad:1}
 ];
let a = 0;
 arregloJson.forEach((e,i)=>{
a += e.edad;
console.log(a);

 })

 