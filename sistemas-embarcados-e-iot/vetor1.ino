int i; //controlola posição do vetor de 0 a 7
int porta;
int um[8] = {0,1,1,0,0,0,0,0}; //vetor
int dois[8] = {1,1,0,1,1,0,1,0};
int tres[8] = {1,1,1,1,0,0,1,0};
void setup()
{
  for(porta = 2; porta<=9; porta++)
  {
  pinMode(porta, OUTPUT);
}
}

void acendeVisor(int array[])
{
  i = 0;
  for (porta=2; porta<=9; porta++)
  {
    digitalWrite(porta, array[i]);
    i++;
  }
}
void loop()
{
acendeVisor(um);
  delay(1000);
  
  acendeVisor(dois);
  delay(1000);
  
  acendeVisor(tres);
  delay(1000);
}