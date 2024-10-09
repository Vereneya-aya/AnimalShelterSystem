# AnimalShelterSystem

	1.	View (MenuView) отвечает за отображение меню, получение ввода от пользователя и вывод сообщений.
	2.	Controller (AnimalShelterController) отвечает за логику работы: вызывает методы сервиса и взаимодействует с пользователем через View.
	3.	Service (AnimalService) содержит логику добавления животных, работу с базой данных или счётчиком.
	4.	Model (Animal, Dog, Cat, etc.) содержит классы животных и их характеристики.

/src
    /controller
        AnimalShelterController.java
    /model
        Animal.java
	PackAnimal
        Pet
	/packAnimals
            Horse.java
	/pets
            Dog.java
            Cat.java
    /service
        AnimalService.java
        Counter.java
    /view
        MenuView.java
    Main.java
