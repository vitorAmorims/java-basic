const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('Digite um numero inteiro? ', value => {
    CalcularNumeroArmstrong(value);
  readline.close();
});

function CalcularNumeroArmstrong(number){
    let n = number.length;
    let arrayNumeros = [];
    
    for (let i = 0; i < n; i++) {
      arrayNumeros.push(Math.pow(Number(number[i]), n));
    }
    const reducer = (accumulator, currentValue) => accumulator + currentValue;
    let soma = arrayNumeros.reduce(reducer);
    if (soma === Number(number)) {
      return console.log(`Sim, o ${number} é número Armstrong`);
    } else {
       return console.log(`O número ${number} NÂO é número Armstrong`);
    }
}