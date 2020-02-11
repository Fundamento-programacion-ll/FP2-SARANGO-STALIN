var nombre = 'stalin asdasda';
var apellido = 'sarango';
var b = "";
var tamanioLetra = nombre.length
console.log(nombre.length);
console.log(nombre.indexOf("v"));

function validateEmail(email) {
    var re = 
    /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}

//console.log(validateEmail('sdadasdsadad@'));
console.log(nombre.search("in"));

console.log(nombre.substr(2));

console.log(nombre.charAt(3));

while (tamanioLetra >= 0) {
    b += nombre.charAt(tamanioLetra)
    console.log(b)
    tamanioLetra--
}
console.log(nombre.slice(1,-8))
console.log(nombre.split(" "))

var texto = "hola que hace"
console.log('Antes de remplazar')
console.log(texto);
console.log('Despues de remplazar')
var textModificado = texto.replace('que hace','khe')
console.log(textModificado);

var ejemploTrim = "hola"
console.log(ejemploTrim)
console.log(ejemploTrim.trim())

console.log(ejemploTrim.concat(" ",nombre,"*_*", apellido));
console.log(ejemploTrim.toLowerCase());
ejemploTrim === nombre;

