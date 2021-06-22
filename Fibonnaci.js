const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('Digite o número de sequencias Fibonacci que deseja: ', param => {
  let numberForSequency = Number(param);
  
  CalcularSequenciaFibonacci(numberForSequency)
  
  readline.close();
});

function CalcularSequenciaFibonacci(param) {
  let n1 = 0; 
  let n2 = 1;
  let n3;
  console.log(n1);
  console.log(n2);
  for(let index = 2; index < param; index++) {
    n3 = n1 + n2;
    console.log(n3);
    n1 = n2;
    n2 = n3;
  }
  console.log("-------FIM--------");
}