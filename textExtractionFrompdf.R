#Copart Challenge
#Extracting text from pdf

install.packages("pdftools")

#Folder containing 2 pdfs

destination <-"B:\\Copart Challenge"

#Making a vector of pdf files
myFiles  <- list.files(path = destination, pattern = "pdf", full.names = TRUE)

#convertng pdf to text
#applying function over a list of vector

lapply(myFiles, function(i) system(paste('"C:/xpdfbin-win-3.04/bin64/pdftotext.exe"', paste0('"', i, '"')), wait = FALSE))

