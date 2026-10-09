#include <LiquidCrystal.h>
#define pot A5 
#define porta A1 

LiquidCrystal lcd(12, 11, 5, 4, 3, 2); 

int valor; 
int leitura; 
float leitur; 
float temperatura; 

int redPin = 13; 
int bluePin = 9; 
int greenPin = 6; 

void setup() { 
  lcd.begin(16, 2); 
  pinMode(pot, INPUT); 
  pinMode(porta, INPUT); 
  pinMode(A2, INPUT); 
  Serial.begin(9600); 
} 

void loop() { 
  valor = analogRead(pot);
  Serial.println(valor);
  
  if (valor <= 510) { 
    leitur = analogRead(porta);
    if (leitur <= 825) { 
      lcd.clear();
      lcd.setCursor(2, 0); 
      lcd.print("Luminosidade"); 
      lcd.setCursor(5, 1); 
      lcd.print("Baixa"); 
      analogWrite(redPin, 255); 
      analogWrite(greenPin, 255); 
      analogWrite(bluePin, 255); 
      
      
      
    } else { 
      lcd.clear();
      analogWrite(redPin, 0); 
      analogWrite(greenPin, 0); 
      analogWrite(bluePin, 0); 
    } 
    
    
  } else if (valor >= 511) { 
    leitur = analogRead(A2); 
    temperatura = ((leitur * 5.0 / 1023.0) - 0.5) * 100.0; 
    lcd.clear();
    lcd.setCursor(2, 0);
    lcd.print("Temperatura");
    lcd.setCursor(4, 1);
    lcd.print(temperatura); 
    lcd.print(" oC");  
    
    
    
    if (temperatura > 30) { 
      analogWrite(redPin, 255); 
      analogWrite(greenPin, 0); 
      analogWrite(bluePin, 0); 
      
      
      
    } else { 
      analogWrite(redPin, 255); 
      analogWrite(greenPin, 255); 
      analogWrite(bluePin, 0); 
    }
  }
  delay(1000);
}
