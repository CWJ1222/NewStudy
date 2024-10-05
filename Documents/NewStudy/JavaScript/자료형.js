const name = 'Mike';
const age = 30;

const name1 = 'Kim';
const name2 = 'Kim';
const name3 = 'Kim';
//문자형은 큰따옴표 작은따옴표 백틱으로 사용 가능

const message = "I'm a boy";
const message1 = "I'm a boy";
console.log('🚀 ~ message1:', message1);
//작은 따옴표 안에 기호 넣을 때는 역슬래시 추가하기

//백틱은 문자열 내부에 변수 표현 시 사용

const message3 = `Kike si ${name1} sksk`;

console.log('🚀 ~ message3:', message3);

const message4 = `I am a ${30 + 1} year old`;
//변수 자리에 바로 표현식도 가능
console.log('🚀 ~ message4:', message4);

console.log(30 + 1);
const x = 3 / 0; //0으로 나누면 무한대
console.log(x);
const name11 = 'mike';
const dd = name11 / 2;
console.log(dd); //문자를 숫자로 나누면 Not a Number,

const a = true;
const rr = false;
console.log(a == name);
console.log(rr == dd);
console.log(
  '===================================================================='
);
/*
	•	느슨한 동등 연산자는 두 값을 비교할 때 **타입 변환(type coercion)**을 수행합니다. 즉, 두 값의 데이터 타입이 다를 경우, 자바스크립트가 자동으로 값을 같은 타입으로 변환한 후 비교합니다.
	•	타입이 다르더라도 값이 같다고 간주될 수 있습니다.
*/
console.log(5 == '5'); // true (문자열 '5'가 숫자 5로 변환된 후 비교)
console.log(true == 1); // true (true가 숫자 1로 변환된 후 비교)
console.log(null == undefined); // true (두 값이 같다고 취급됨)

/*
	•	엄격한 동등 연산자는 타입 변환 없이, 값과 타입이 모두 같아야 참을 반환합니다.
	•	타입이 다르면 값이 같더라도 false를 반환합니다.
*/
console.log(
  '===================================================================='
);
console.log(5 === '5'); // false (타입이 다름: 숫자 5와 문자열 '5')
console.log(true === 1); // false (타입이 다름: 불리언과 숫자)
console.log(null === undefined); // false (타입이 다름)
console.log(
  '===================================================================='
);
//null 존재하지 않음, undefined 할당되지 않음
let user = null;

console.log(typeof 3);
console.log(typeof name);
console.log(typeof true);
console.log(typeof 'ccc');
console.log(typeof null); //null 은 object이다.
console.log(typeof undefined);

//object은 객체형이다.
//null은 객체가 아닌데 객체로 나옴.. 오류임
//백틱 아닌 작은따옴표를 넣으면 문자열이 그대로 출력됨
console.log(
  '===================================================================='
);
const name222 = 'mike';
const as = '나는';
const ed = '입니다.';
console.log(as + name222 + ed); // 합쳐지면 문자열로 바뀜

const age11 = 30;
console.log(as + age + ed);
