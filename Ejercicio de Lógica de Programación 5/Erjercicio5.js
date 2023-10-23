let numSecreto = Math.floor(Math.random() * 100) + 1;
let bandera = true;

do {
    alert("Hola el número secreto es: " + numSecreto); // Para verificar si genera el número correctamente
    let respuesta = parseInt(prompt("Intenta adivinar el número secreto (1-100)"));
    if (isNaN(respuesta) || (respuesta < 0 || respuesta > 100)) {
        alert("Ingrese un valor válido");
    } else if (respuesta != numSecreto) {
        alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    } else {
        alert("Felicidades, adivinaste el número secreto.");
        bandera = false;
    }
} while (bandera);