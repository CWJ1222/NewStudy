const name = prompt('이름을 입력하시오');
alert(`환영합니다. ${name}님`);

console.log(name); // 취소 입력시 null값 들어감
const name1 = prompt('이름을 입력하시오', '이런식으로');

//두개의 변수를 줘서 디폴드 입력 가능

const isAdult = confirm('당신은 성인입니까?');
console.log(isAdult);

//confirm 확인은 true, 취소는 false
//기본 제공 창은 간단, 스크립트 일시정지, 스타일링 불가, 브라우저마다 다름
//기본은 빠르고 간단해서 많이 사용 됨
