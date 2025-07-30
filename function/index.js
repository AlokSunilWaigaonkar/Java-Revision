class Dog extends Animal {
    speak() {
      console.log(`${this.name} barks.`);
    }
  }
  
  const pet = new Dog("Bruno");
  pet.speak(); // Output: Bruno barks.