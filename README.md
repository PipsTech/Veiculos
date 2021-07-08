# Veiculos

Uma empresa do ramo de entrega de encomendas contratou você para participar do desenvolvimento de um sistema
de software que os auxilie no controle de seus custos. Em primeiro lugar, a preocupação da empresa é monitorar os
gastos relacionados aos veículos de entrega. Os veículos da empresa fazem rotas diárias. Cada rota tem um uma
distância total percorrida a ser percorrida.
Existem diversos tipos de veículos que realizam as entregas (carros, vans, furgões e caminhões). Cada um tem um
tanque de combustível de capacidade diferente. A autonomia diária (quilometragem máxima) do veículo depende do
combustível utilizado. Desta maneira, as rotas só podem ser alocadas para um veículo dentro do seu limite diário.
Além disso, os veículos precisam realizar manutenções programadas de acordo com quilometragens definidas. Estas
regras são resumidas nos quadros abaixo:
Veículo Tanque Manutenção periódica Manutenção troca de peças
Carro 50L 10.000km 10.000km
Van 60L 10.000km 12.000km
Furgão 80L 10.000km 12.000km
Caminhão 250L 20.000km 20.000km
Combustível Gasto médio Preço médio
Álcool 7km/L R$ 4,49
Gasolina 10km/L R$ 5,79
Diesel 4km/L R$ 4,34
Sabendo que um veículo usa somente um tipo de combustível por vez, mas pode mudar o tipo de combustível utilizado,
a empresa precisa:
a) Adicionar, para um veículo, uma rota, respeitando o limite diário.
b) Saber a quilometragem total percorrida por um veículo.
c) Realizar as manutenções de um veículo tão cedo quanto forem necessárias.
d) Calcular a despesa total de um veículo, considerando combustível e manutenções.
Implemente este sistema seguindo o diagrama de classes em anexo.
