package com.imcoding.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.123456789";

	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpQIBAAKCAQEAwwcVf8Bo3nO6+fxVhsxJWF16MGNwyyKmq8Ju3Q/+QP/GSHBx\r\n" + 
			"ZJRmfJmnSw/OqCABFdVF2+xctWeOGkNavx8yrlUw72SUoZq+cFF4aQgomnNKgeiW\r\n" + 
			"iOCuVlogpB3oowdR5NV9UmXuZwDU3bfgUoj0+49ow6L37Eb9BmaE3IQzqavReXZB\r\n" + 
			"8XuK2GnRqI2r2HxSRlsoUphEf+55VuTuDPxb7yJJFwOxedmJzyVo+BX3y99PmcJw\r\n" + 
			"UGzEn8a/sB3WSU7v54iDKLoaDa1EtDSZlLml2FQfpfGoh3iHuz9ZY9PzVw5ZqPAc\r\n" + 
			"g7kiBZdXCejW6s2hSAPd5LuG2YylbY/3dozYzQIDAQABAoIBAQCL5nUBo2CW0qX5\r\n" + 
			"1Yz0mW6zuLqCI5Mx5LVy2JL2eRaGQfRW2nI9GEc8cmyTZ89ywyKEKu1mCXOnnZVO\r\n" + 
			"OarLFvIgJHRqBdio5HxfzdF2ZqfZw4JbFiGGJsZoo1Zu5BWRfRq98HdpuD0AHpSU\r\n" + 
			"R+bezegO3JzmWe1GzNWM1dXQ6fS1bI7MQ4KC0IpxVr3kgiih7AyT/kQdm1LpX5bL\r\n" + 
			"NXlRaR4Lch/I+lsEjdnPryVFcuqe+JwKD8Mu9sH2zezSE3O3HfXXIqBoxYwz89r6\r\n" + 
			"mx5wTCGOWySYDJwAaZv7GHJiIa0hu+Pd5tknXzl5cK6jGlJ4TdtXKnh+tGC9lk4a\r\n" + 
			"dMnVhViBAoGBAOHNIb+c4ockncHpmvDCI8uXElXMv9e0WH6gliamOqUd8UXutp1s\r\n" + 
			"2LWMc7admXNVk3mpSt9F2eOqve6Ba/oZVtzDeFu4AfJk8+opOrqlSIEmAI2HP4wj\r\n" + 
			"J0DRFHMPMDDjOa9JsoLNCzHgBlmI3TSjFa68IJIKofCuKZPx4aj1sGsJAoGBAN0c\r\n" + 
			"Vzd52Xs629t+6OasBpd01Ci8QlMcYdraIxqR5Jbs++QaBb5NYpgc62Qh2l/Qppr2\r\n" + 
			"N+9+WsOb1s717iRbnEKCkjyX9ZLs9zguBbFOTxan2Hz+/zIrAEplXMWOlB/Vbcgu\r\n" + 
			"b1VJB0gpsXHML967VXl04GazzZJTQK09XpseY/ylAoGBAMsEUI+jUtkHRwAONUy6\r\n" + 
			"gMyP6+BQ0zvx3o8be2UMmDXVEhU6Z95q+v1gZrmOQWW9T3dXiwXsG9fisBo9KwQW\r\n" + 
			"vE6JQTHV44o40kV7BF7ENMhJjr2xGKW7BZP1aFl7Em0iH79Gl8Wa7bHOJmdh8uFc\r\n" + 
			"sCYG55HnFWr8bE2kcKwlGpVhAoGAJtfItpUwUIapgujLj2JfEhJTBwjzedg9lI3H\r\n" + 
			"pu5EQwNEyPCNW74KeQBzlbagvz5PVl+0udzvovdoiBkKCdcSH1kCyaREXthEIdlr\r\n" + 
			"5JcGK8u2q1a8jBqjxW4DGy2N9f2veIA3zLq0jcfNRVmCe1VbkaenmEMz9OWtMgHa\r\n" + 
			"8dMn64UCgYEAmpKQhw4WaZ2qHEyLeJDvFJJ7WrPub32iJ6hCxbZfZGkyBvFzkkzO\r\n" + 
			"SayPtIXtpWPWJkEjIqxe7VWm6Le4p069U1UmREC3VG2bGiXmO+HAbVkemZ1Xi0kN\r\n" + 
			"A67b8NAPlR/YunQHr1wMVDZCVhcfOZGAmiN2cvEX2sTL0sNynCSvnMo=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwwcVf8Bo3nO6+fxVhsxJ\r\n" + 
			"WF16MGNwyyKmq8Ju3Q/+QP/GSHBxZJRmfJmnSw/OqCABFdVF2+xctWeOGkNavx8y\r\n" + 
			"rlUw72SUoZq+cFF4aQgomnNKgeiWiOCuVlogpB3oowdR5NV9UmXuZwDU3bfgUoj0\r\n" + 
			"+49ow6L37Eb9BmaE3IQzqavReXZB8XuK2GnRqI2r2HxSRlsoUphEf+55VuTuDPxb\r\n" + 
			"7yJJFwOxedmJzyVo+BX3y99PmcJwUGzEn8a/sB3WSU7v54iDKLoaDa1EtDSZlLml\r\n" + 
			"2FQfpfGoh3iHuz9ZY9PzVw5ZqPAcg7kiBZdXCejW6s2hSAPd5LuG2YylbY/3dozY\r\n" + 
			"zQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
	
}
