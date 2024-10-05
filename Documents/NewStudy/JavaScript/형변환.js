//String() 문자형으로 변환
//Number() 숫자형으로 변환
//Boolean() 불린형으로 변환

//문자 + 문자 = 문자
//"100" + 200 =?
/*
const mathScore = prompt('수학몇점?');
const engScore = prompt('영어몇점?');
const result = mathScore + engScore;
*/
//자동 형변환은 원인 찾기 힘들다.
//명시적 형변환으로 미리 바꾸어 주는 게 좋다.
//
console.log(
  String(1),
  String(true),
  String(false),
  String(null),
  String(undefined)
);

console.log(Number('30'));
console.log(Number(true), Number(false));
//true를 숫자로 변환 1, false를 숫자로 변환 0

/*
..false로 인식되는 것들..
숫자 0 
빈문자열''
null
undefined
NaN
..이외는 true반환
*/
console.log(Number(null)); //0
console.log(Number(undefined)); //NaN
