package pkg

type WeatherData struct {
	temperature float64
	humidity    float64
	pressure    float64
}

func (w *WeatherData) RegisterObserver() {

}

func (w *WeatherData) RemoveObserver() {

}

func (w *WeatherData) NotifyObservers() {

}
