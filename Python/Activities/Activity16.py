class Car:

    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")
        
    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")

car1 = Car("Ford", "Mustang", 1964, "Manual", "Red")
car2 = Car("Tesla", "X", 2025, "Automatic", "Black")
car3 = Car("Toyota", "Corolla", 2018, "Automatic", "DBlue")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()
