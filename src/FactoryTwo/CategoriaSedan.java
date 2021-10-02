package FactoryTwo;

class CategoriaSedan extends Categoria {
    // Criador do produto
    // pode conter outros atributos
    // Factory Method definido neste momento pela criação de uma instância de carro
    // a partir de outra classe.
    public Carro novoCarro() {
        return new CarroSedan();
    }
}
