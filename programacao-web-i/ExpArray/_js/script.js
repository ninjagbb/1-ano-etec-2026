    
    // Seleciona o formulário pelo ID
    const form = document.getElementById('frutasForm');

    // Adiciona um evento para quando o formulário for enviado
    form.addEventListener('submit', function(event) {
      // Previne o comportamento padrão do formulário (recarregar a página)
      event.preventDefault();

      // Cria um array vazio para armazenar as frutas
      const frutas = [];

      // Pega o valor de cada input e adiciona no array frutas
      frutas.push(document.getElementById('fruta1').value);
      frutas.push(document.getElementById('fruta2').value);
      frutas.push(document.getElementById('fruta3').value);
      frutas.push(document.getElementById('fruta4').value);
      frutas.push(document.getElementById('fruta5').value);

      frutas.sort();
console.log(frutas);

      // Seleciona o elemento onde o resultado será exibido
      const resultadoDiv = document.getElementById('resultado');

      // Limpa qualquer conteúdo anterior dentro do resultado
      resultadoDiv.innerHTML = '';

      // Cria um título para a lista de frutas
      const titulo = document.createElement('h3');
      titulo.textContent = 'Frutas digitadas:';
      resultadoDiv.appendChild(titulo);

      // Cria uma lista não ordenada para mostrar as frutas
      const lista = document.createElement('ul');

      // Para cada fruta no array, cria um item da lista e adiciona na lista
      frutas.forEach(function(fruta) {
        const item = document.createElement('li');
        item.textContent = fruta;
        lista.appendChild(item);


      });

      // Adiciona a lista no elemento resultadoDiv
      resultadoDiv.appendChild(lista);

      const limparBtn = document.getElementById('limparBtn');

limparBtn.addEventListener('click', function() {
  const resultadoDiv = document.getElementById('resultado');
  resultadoDiv.innerHTML = ''; //Limpa o conteúdo da lista exebir
});

    });
