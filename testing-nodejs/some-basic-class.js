class Person {
    constructor() {
        this.id = "123"
    }

    set name(name) {
        this._name = name.charAt(0).toUpperCase() + name.slice(1);
    }

    get name() {
        return this._name;
    }

    sayHello() {
        let message = `Hello ${this._name}!`;
        console.log(message);
        return message;
    }
}

module.exports.Person = Person;