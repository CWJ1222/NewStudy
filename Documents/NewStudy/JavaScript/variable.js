//문자열은 "" '' 로 감싸야 됨
let name = 'Mike';
age = 30;
console.log('🚀 ~ age:', age);

//예약어는 변수로 사용 불가
//alert(name); alert는 브라우저 환경에서만 작동함.

console.log('name: ', name);

//변수를 이렇게 선언하는 것은 위험, name이 이후에 있다면 덮어 씌워지기 때문.
//let const를 이용해야 함

let name1 = 'jike';
console.log('name1: ', name1);

//const 는 절대 바뀌지 않는 상수, 수정하지 않음, 상수는 대문자로 하는 것이 좋음

//let은 변하는 값, const는 변하지 않는 값 으로 주로 함
/*
변수는 문자, 숫자 $, _만 사용
첫글자는 숫자 사용 x
예약어 사용불가
가급적 상수는 대문자로
변수명은 읽기 쉽고 이해할 수 있게 선언
*/
