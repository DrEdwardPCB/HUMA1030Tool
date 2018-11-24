HUMA1030 tool
=======
## Romanized cantonese to original cantonese IPA
This program is written to tackle the annoying and rubbish Assignment 2 for HKUST HUMA1030(Structure of the chinese language) it is created and managed by Dr_EdwardPCB(game name) a poor student who taken this course in 2018-2019 Fall. 

## HUMA1030 Assignment 2 requirement
Names of places can sometimes preserve the old sounds of a language or dialect. (e.g. “番禺” is traditionally pronounced as /pʰan55 y35/ instead of /fan55 y35/. the bilabial sound /pʰ/ is actually one form of the old pronunciation of /f/, because by the time of Old Chinese and Early Middle Chinese, the labio-dental sound /f/ had not yet existed. /f/ sound appeared in Chinese at late as the period of Middle Chinese, around the middle of the Tang Dynasty. All initial /f/ of today were once pronounced as bilabials)
The road signs of Hong Kong are somewhat conservative in such a respect. Today’s Hong Kong road signs use romanized place names and Chinese characters. The names in romanized letters are mostly inherited from the British colonial period. These names provide with us ample data for exploring sound changes during the last 100-200 years in Hong Kong.
Your work is to:
1. Search for such romanized names (to guarantee the data are big and sufficient enough, no less than 100 qualified names* are required. You can do this by fieldwork, consulting maps and atlases of Hong Kong, especially the older ones, and conference gazetteers.) (40 points)
2. Summarize the sound system used in the place names of the road signs* (30 points). By comparing the resulting sound system with that of present-day standard Cantonese, prove:
2. One major evolution took place for Cantonese initials during the last 100-200 years is that, early Cantonese had two sets of dental/alveolar affricates and fricatives, and they merged into one set nowadays. (20 points)
4. Other evolutions in initials or finals (10 additional points for each qualified testify)

## creation of the programme
Program is written based on the followings
* [Hong Kong Government Cantonese Romanisation](https://en.wikipedia.org/wiki/Hong_Kong_Government_Cantonese_Romanisation)
* [initials of Man.and Can..](https://github.com/DrEdwardPCB/HUMA1030Tool/blob/master/initials%20of%20Man.%20%26%20Can..pdf)
* [Finals of Man.and Can..](https://github.com/DrEdwardPCB/HUMA1030Tool/blob/master/finals%20of%20Man.%20and%20Can..pdf)
* [IPA phoneme /ʃ/](http://teflpedia.com/IPA_phoneme_/%CA%83/)
## run the programme
follow the step to run the program
1. download the release `Roman to IPA.jar`
2. place the file in any of your directory(desktop suggested)
3. create a new .txt file named `in.txt`(name is important) in the same directory as the `Roman to IPA.jar`
4. double click the `Roman to IPA.jar`
5. 2 file will be created 1 named `out.txt` another named final `out.txt` containing the info you need
## example input and output

for the following input

`in.txt`
```
Nam Cheong Street
Li Tak Street
Mong Kok Road
Tung Chau Street
Fung Tan Road
Yen Chow Street
```
the corresponding output will be

`out.txt`
```
n=a/ɐ=m  tʃʰ/tʃ=œ=ŋ  Street
l=i/ɛ=  tʰ/t=a/ɐ=k  Street
m=ɐ/ɔ/ou=ŋ  kʰ/k=ɐ/ɔ/ou=k  Road
tʰ/t=ɐ/u/ɵ/y=ŋ  tʃʰ/tʃ=au/ɐu=  Street
f=ɐ/u/ɵ/y=ŋ  tʰ/t=a/ɐ=n  Road
j=ɛ=n  tʃʰ/tʃ=ɐ/ɔ/ou=w  Street
```
`finalout.txt`
```
(nam,nɐm,)  (tʃʰœŋ,tʃœŋ,)  (Street,)  
(li,lɛ,)  (tʰak,tʰɐk,tak,tɐk,)  (Street,)  
(mɐŋ,mɔŋ,mouŋ,)  (kʰɐk,kʰɔk,kʰouk,kɐk,kɔk,kouk,)  (Road,)  
(tʰɐŋ,tʰuŋ,tʰɵŋ,tʰyŋ,tɐŋ,tuŋ,tɵŋ,tyŋ,)  (tʃʰau,tʃʰɐu,tʃau,tʃɐu,)  (Street,)  
(fɐŋ,fuŋ,fɵŋ,fyŋ,)  (tʰan,tʰɐn,tan,tɐn,)  (Road,)  
(jɛn,)  (tʃʰɐw,tʃʰɔw,tʃʰouw,tʃɐw,tʃɔw,tʃouw,)  (Street,)  

```
## disclaimer
there is no guarantee that the transcription fits the instructor requirement, don't come blame me if the transcription is not correct. This program is publish as open source, please commit the correct code to another branch in case there are any mistake
