const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});
   
readline.question("Digite um numero ou palavra, para saber se é palindromo: ", value => {
  
  isPalindrome(value);
  
  readline.close();
});

function isPalindrome(param){
    let original = param;
    let reverse = '';

    for(let index = original.length -1; index >= 0; index--){
      reverse += original.charAt(index);
    }
    if (original === reverse){
      console.log(original + " é um palindromo!!");
    } else {
      console.log(original + " NÂO é um palindromo!!");
    }
    
}