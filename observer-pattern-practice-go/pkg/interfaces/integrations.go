package interfaces

type Subject interface {
	RegisterObserver(o Observer)
	RemoveObserver(o Observer)
	NotifyObservers()
}

type Observer interface {
	Update()
}
