import time
import pydirectinput
import pyautogui

pydirectinput.PAUSE = 0
pydirectinput.FAILSAFE = True

#algoritmo de coordenadas
X1 = 424 
Y1 = 515

X2= 766  
Y2= 552

largura = X2 - X1
altura = Y2 - Y1

from PIL import Image
base_img = Image.open("base.png")

#captura da tela
def capturar_tela():
 return pyautogui.screenshot(region=(X1, Y1, largura, altura))

tela_atual = capturar_tela()

#comparação de imagens
from PIL import ImageChops, ImageStat

img1 = base_img
img2 = tela_atual

def diferenca_media(img1, img2):
    diff = ImageChops.difference(img1, img2)
    stat = ImageStat.Stat(diff)
    return sum(stat.mean) / len(stat.mean)

print("farmando...")

while True:
   
    pydirectinput.keyDown("x")
    time.sleep(0.08)
    pydirectinput.keyUp("x")

    tela_atual = capturar_tela()
    diferenca = diferenca_media(base_img, tela_atual)
    print("Diferença:", diferenca)

    pydirectinput.keyDown("shift")
    pydirectinput.keyDown("left")
    time.sleep(0.2)
    pydirectinput.keyUp("left")
    pydirectinput.keyUp("shift")
    
    if diferenca > 61:
        print("CARD FARMADO!")
        time.sleep(1.5)
        break

    time.sleep(0.2)

