package main
import (
	"fmt"
)

func main() {
	fmt.Println("Qual e o seu nome: ")
	var name string
	fmt.Scanln(&name)
	fmt.Printf("Oi. %s! Eu sou a linguagem Go! ", name)
}