class Animal:
    def __init__(self, name, species):
        self.name = name
        self.species = species

    def make_sound(self):
        print(f"{self.name} makes a sound.")
        print(f"{self.name} is a {self.species}.")

dog = Animal("Buddy", "Dog")
dog.make_sound()



