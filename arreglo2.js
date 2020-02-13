

var arreglo=[
    {nombre:'stalin',
    apellido:'sarango',
    edad:25},
    {nombre:'anapaula',
    apellido:'mendoza',
    edad:45}
];
var buscarUnUsuario=(arreglo,usuarioaBuscar)=>{
    var usuarioEncontrado=arreglo.find(usuario=>{
        return usuario.nombre === usuarioaBuscar;
    });
    console.log(usuarioEncontrado);
};
buscarUnUsuario(arreglo,'stalin');

var agregarUsuario=(arreglo,nombre,apellido,edad)=>{
    arreglo.unshift({nombre,apellido,edad});
    console.log(arreglo);
};
agregarUsuario(arreglo,'karla','andrade',34);

var buscarUnUsuarioYagregar=(arreglo,nombre)=>{
    var usuarioEncontrado=arreglo.find(usuario=>{
        return usuario.nombre === nombre;
    });
    if(usuarioEncontrado===undefined){
        console.log('El usuario no existe');
        agregarUsuario(arreglo,nombre,'paul',24);
    }else{
        console.log(usuarioEncontrado);
    }

};
buscarUnUsuarioYagregar(arreglo,'stalin');

var eliminarUsuario= (arreglo,nombre)=>{
    var usuarioEncontrado=arreglo.filter(usuario=>{
        return usuario.nombre !== nombre; 
    });
    console.log(usuarioEncontrado);
};
eliminarUsuario(arreglo,'jon');