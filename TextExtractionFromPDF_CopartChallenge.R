#Copart Challenge
#Extracting a text from pdf

# Note: The program is incomplete

#Installing R package
install.packages(pdftools)

#importing a package - pdftools
library(pdftools)


texas.file.url <-"https://github.com/patilankita79/CopartChallenge_April4_2017/blob/master/Texas%20Title.pdf"
texas.file <- "Texas.pdf"
download.file(texas.file.url, texas.file)

#Converting pdf to text
texas.file.text <- pdf_text(texas.file)

#To print the contents of pdf file
cat(texas.file.text)


arkansas.file.url <-"https://github.com/patilankita79/CopartChallenge_April4_2017/blob/master/title_arkansas.pdf"
arkansas.file <- "Arkansas.pdf"
download.file(arkansas.file.url, arkansas.file)

#Converting pdf to text
arkansas.file.text <- pdf_text(arkansas.file)

#To print the contents of pdf file
cat(arkansas.file.text)

