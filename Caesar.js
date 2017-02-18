//政大105數位 資結考題
//https://yysu.github.io/jsplayground/
function GetASCII(Str) {
	return Str.charCodeAt(0);
}

function Sub(Str) {
  if(Str == 32)
  	return Str;
  else
    return Str-3;
}

function ToChar(Str) {
	return String.fromCharCode(Str);
}

var plainText = "DOT NOT PIG";
var plainTextArray = plainText.split("");
var cipherTextArray = plainTextArray.map(GetASCII).map(Sub).map(ToChar);
var cipherText = cipherTextArray.join("");
console.log(cipherText);
