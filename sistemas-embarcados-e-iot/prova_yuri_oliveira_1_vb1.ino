#include <LiquidCrystal.h>
#define pot A5 

int valor1, valor2; 


LiquidCrystal lcd(12, 11, 5, 4, 3, 2);


//distancia
int pino = 6;
float velocidade_som = 331.5 + 0.6 * 20;

//luminosidade
int leitura ;
int lampada = 7;
#define porta A1

//temperatura
float leitur;
float temperatura;

//movimento
int pinPir = 8;
int leitu;

void setup()
{
  pinMode(pot, INPUT);
  pinMode(porta, INPUT);
  pinMode(lampada, OUTPUT);
  pinMode(pinPir, INPUT);
  pinMode(A0, INPUT);
  
  Serial.begin(9600);
  lcd.begin(16, 2);
}


//distancia
float calculaDistancia() //funçao retorno
{
  //OUTPUT: arduino envia um sinal para o sensor
  pinMode(pino, OUTPUT);
  digitalWrite(pino, LOW);
  delayMicroseconds(3);
  digitalWrite(pino,HIGH);
  delayMicroseconds(5);
  digitalWrite(pino, LOW);
  
  //INPUT:arduino vai receber do sensor a reflaxao do sinal
  pinMode(pino, INPUT);
  //funçao pulseiraIn vai ler o valor do sensor
  float valorUltra = pulseIn(pino, HIGH);
  
  //valorUltra está em microsegundos
  //converter microsegundoqos para milisegundlo  e para segundo
  //divide por 2 pq é o tempo só da ida
  float tempo = (valorUltra/1000.0/1000) /2 ;
  
  
  float d = (velocidade_som * tempo) * 100;
  
  return d;
  
}


void loop()
{
  //Funçao map
  valor1 = analogRead(pot); 
  
  /* funçao map: converte os valores de porta analogica(0-1023) 
  map(leitura,
  min_valor_entrada,
  max_valor_entrada,
  min_valor_saida,
  max_valor_saida) */ 
  valor2 = map(valor1, 0, 1023, 1, 4); 
   Serial.println(valor2); 
  
  
  if(valor2 == 1){
    lcd.clear();
    int distancia2 = calculaDistancia();
    lcd.setCursor(3, 0);
    lcd.print("Distancia:");
    lcd.setCursor(7, 1);
    lcd.print(distancia2);
    delay(200);
  }
  
   else if (valor2 == 2) {
    lcd.clear();
    leitura = analogRead(porta);
    lcd.setCursor(0, 0);
    lcd.print("Luminosidade");
    
    if (leitura <= 937) {
      lcd.setCursor(6, 1);
      lcd.print("Baixa");
    } else {
      lcd.setCursor(6, 1);
      lcd.print("Alta");
    }
    delay(200);
  } 
  else if (valor2 == 3)
  {
  leitur = analogRead(A0);//lê a tensão no sensor de temperatura
  
  temperatura = ((leitur * 5/1023) - 0.5)*100;
  //converte o valor lido em tensão(Volts)
  //Converte para temperatura, em °C (tensao*1000)
   if (temperatura <= 20) {
      lcd.setCursor(0, 0);
      lcd.print("Frio");
      lcd.setCursor(0, 1);
      lcd.print(temperatura);
    } else {
      lcd.setCursor(0, 0);
      lcd.print("Quente");
      lcd.setCursor(0, 1);
      lcd.print(temperatura);
    }
    delay(200);
  } 
     else{
    lcd.clear();
    leitu = digitalRead(pinPir); 
    
    if (leitu == 0) {
      lcd.setCursor(0, 0);
      lcd.print("Sem movimento");
    } else {
      lcd.setCursor(0, 0);
      lcd.print("Movimento");
    }
    delay(200);
  }
}
