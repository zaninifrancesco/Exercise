#Indirizzo iniziale
19.0.0.0/8	

#Numero Sottoreti
n_sottoreti = 500

#Bit da prendere in prestito
2^n n = 9 => 512

#Subnet Mask
19.00000000.00000000.00000000

#Nuova parte rete
19.00000000.0|0000000.00000000 /17

#Subnet
	rete		primo host	ultimo host 
1.
	19.0.0.0	19.0.0.1	19.0.127.254
2.
	19.0.128.0	19.0.128.1	19.0.255.254
3.
	19.1.0.0	19.1.0.1	19.1.127.254
500.
	19.249.128.0	19.249.128.1	19.249.255.254