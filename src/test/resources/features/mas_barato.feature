#language: es
  #autor: mesa.cristian@gmail.com

Característica: verificar tarifas cobradas a los clientes

  Esquema del escenario: Escenario: buscar el hotel mas barato <ciudad>
    Dado que el agente se encuentra en la pagina inicial
    Cuando el busca el destino con los datos
      | ciudad   | fechaInicio   | fechaFin   | habitaciones   | numeroAdultos   | numeroNinos   |
      | <ciudad> | <fechaInicio> | <fechaFin> | <habitaciones> | <numeroAdultos> | <numeroNinos> |
    Y selecciona el hotel con menor precio
    Entonces el vera el "<totalPagar>"
    Ejemplos:
      | ciudad        | fechaInicio | fechaFin   | habitaciones | numeroAdultos | numeroNinos | totalPagar |
      | Honolulu      | 12/23/2020  | 12/27/2020 | 1            | 2             | 2           | 555.00     |
#      | Los Angeles   | 12/23/2020  | 12/24/2020 | 1            | 1             | 0           | 218.00     |
#      | San Francisco | 12/24/2020  | 12/25/2020 | 1            | 3             | 3           | 598.00     |
#      | Las Vegas     | 12/23/2020  | 12/24/2020 | 1            | 4             | 0           | 180.00     |
#      | New York      | 12/29/2020  | 12/31/2020 | 1            | 2             | 0           | 357.00     |
#      | Nassau        | 12/29/2020  | 12/31/2020 | 1            | 2             | 0           | 747.00     |
#      | Paris         | 12/29/2020  | 12/31/2020 | 1            | 2             | 0           | 330.00     |
#      | London        | 12/23/2020  | 12/26/2020 | 1            | 2             | 0           | 596.00     |
#      | Rome          | 12/23/2020  | 12/26/2020 | 1            | 1             | 2           | 996.00     |
#      | Hamburg       | 12/23/2020  | 12/26/2020 | 1            | 1             | 2           | 796.00     |