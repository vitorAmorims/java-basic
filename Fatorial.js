const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('Digite um numero para calcular o fatorial: ', value => {
  Fatorial(Number(value));
  readline.close();
});

function Fatorial(param){
    let soma = 1;
    if (typeof param !== 'number'){
        return console.log("Somente numero");
    } else {
        for(let index = param; index > 0; index--){
            soma *= index;
        }
    }
    return console.log(soma);
}