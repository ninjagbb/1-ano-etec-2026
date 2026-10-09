# 🔌 Embedded Systems & IoT (Arduino & Tinkercad)

This folder centralizes Arduino C++ projects, hardware simulations, and circuit designs developed during the Embedded Systems and IoT coursework at ETEC, focusing on microcontroller programming, sensors, actuators, and digital logic.

## 📂 Projects & Hardware Descriptions

- **[vetor1.ino](./vetor1.ino)**: 7-Segment Display Counter using Arrays.
  - *What it does*: Controls a 7-segment display using an Arduino Uno and one-dimensional arrays to render and cycle through numeric patterns sequentially.
  - *Tools & Elements Used*: Arduino Uno, breadboard, 7-segment display, protective resistors, `for` loops, binary arrays, and dynamic functions (`digitalWrite`).
  - *Circuit Schematic*: ![Circuit Schematic](./Vetor.png)

- **[prova_yuri_oliveira_1_vb1.ino](./prova_yuri_oliveira_1_vb1.ino)**: Multi-Sensor Monitoring System with LCD and Potentiometer Selector (Exam Project).
  - *What it does*: Uses a rotary potentiometer to switch between four different operation modes on a 16x2 LCD screen, displaying data from an ultrasonic distance sensor, an LDR light sensor, a temperature sensor, and a PIR motion detector.
  - *Tools & Elements Used*: Arduino Uno, LiquidCrystal library, ultrasonic distance sensor, LDR photoresistor, TMP36 temperature sensor, PIR motion sensor, potentiometer for mode selection (`map` function), and conditional logic routing.
  - *Circuit Schematic*: ![Circuit Schematic](./Prova%20Yuri%20Oliveira%201-VB.png)
  - 
- **[prova_yuri_oliveira1.ino](./prova_yuri_oliveira1.ino)**: Dual-Mode Environmental Monitor with LCD and RGB LED Indicator.
  - *What it does*: Uses a rotary potentiometer to switch between two main monitoring modes on a 16x2 LCD screen: ambient light monitoring via an LDR sensor (with low-light detection) and temperature monitoring via a TMP36 sensor (with RGB LED visual feedback for thresholds).
  - *Tools & Elements Used*: Arduino Uno, LiquidCrystal library, potentiometer for mode selection, LDR photoresistor, TMP36 temperature sensor, RGB LED indicators, and conditional threshold logic.
  - *Circuit Schematic*: ![Circuit Schematic](./Prova-Yuri%20Oliveira.png)
---
> *"We are born of the blood, made men by the blood, undone by the blood."*
