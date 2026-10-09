#include <LiquidCrystal.h>


LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

int leitura = 0;      // Faz a leitura do botão
int pinBotao = 6;   
int pinLed = 7;   
int pinLd = 8;  
int botaoAnterior = 0;
bool ligar = false; 

void setup()
{
  lcd.begin(16, 2);
  pinMode(pinBotao, INPUT);
  pinMode(pinLed, OUTPUT);
  pinMode(pinLd, OUTPUT);
  Serial.begin(9600);
}
void loop()
{
  Serial.println(leitura);
  leitura = digitalRead(pinBotao);//lê o valor do botão
  if (leitura == 1 && botaoAnterior == 0) //se botão pressionado
  {
    if (ligar == false) {
    digitalWrite(pinLed, 1);  
    digitalWrite(pinLd, 0); 
    ligar = true;
  } 
  else if (ligar == true)
  {
    digitalWrite(pinLed, 0);  
    digitalWrite(pinLd, 1);   
    ligar = false;
}
  botaoAnterior = leitura;//atualiza o estado do botão
}

}
