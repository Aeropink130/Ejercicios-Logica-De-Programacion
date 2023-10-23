// declaración de mi arreglo que contendrá los números ingresados por el usuario
let numeros = [];

// ciclo for para pedir los números al usuario
for (let contador = 0; contador < 3; contador++) {
    numeros[contador] = prompt("Ingrese el " + (contador + 1) + "° número: ");
}

if (numeros[0] == numeros[1] && numeros[1] == numeros[2]) {
    console.log("Los tres números son iguales");
} else {
    // ordenar los números de mayor a menor
    numeros.sort(function (a, b) { return b - a });

    // mostrar los números ordenados
    console.log("Los números ordenados de mayor a menor" + numeros);

    // ordenar números de menor a mayor
    numeros.reverse();

    // mostrar los números ordenados
    console.log("Los números ordenados de menor a mayor" + numeros);
}