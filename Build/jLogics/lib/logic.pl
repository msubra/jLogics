/*
	+ 		=> OR
	* 		=> AND
	@ 		=> NAND
	/ 		=> NOR
	^ 		=> XOR
	-		=> NOT
*/

logic(A*0,0).

logic( A * (-A) , 0 ).

logic( A + (-A) , 1 ).

logic( A @ A, R ):-
	logic(-A,R).

logic( A @ 1 , R ):-
	logic(-A,R).
	
logic( A @ 0 , 1 ).

logic( A /  A, R ):-
	logic(-A,R).

logic( A / 0 , R ):-
	logic((-A),R).

logic( A / 1 , 0 ).

logic( A ^ A , 0).

logic( A ^ 0 , R):-
	logic( A , R).

logic( A ^ 1 , R):-
	logic( (-A) , R).

logic( (-A) , R):-
	logic( A,R1),
	R = -R1.

logic( A * 1, R ):- 
	logic(A,R).

logic( A + 1, R ):-
	logic(A,R).

logic( A + 0, R ):- 
	logic(A,R).

logic( A * A, R ):- 
	logic(A,R).

logic( A + A, R ):- 
	logic(A,R).

logic( -(-A) , R ):-
	logic(A,R).

logic( A + B , R ):-
	logic(A,A1),
	logic(B,B1),
	A \= A1,  % A is not equal to A1 
	B \= B1, %B is not equal to B1
	logic( A1+B1 , R).

logic( A * B , R ):- 
	logic(A,A1),
	logic(B,B1),
	A \= A1,  % A is not equal to A1 
	B \= B1, %B is not equal to B1
	logic( A1*B1 , R).

logic(  A + (A * B), R):-
	logic(A,R).

logic(  A + ((-A) * B), R):-
	logic(A+B,R).

logic( (A * B) + (A * C), R ):-
	logic( A * (B+C) , R).

logic( (A + B) * (A + C), R ):-
	logic( A +(B*C) , R).

logic( (-A) * (-B) , R ):-  % -A * -B = -(A + B)
	logic( -(A + B) , R).

logic(A+B+C,R):-
	logic(A+B,R1),
	A+B+C \== R1 + C,
	logic(R1+C,R).

logic(A*B*C,R):-
	logic(A*B,R1),
	A+B+C \== R1 + C,
	logic(R1*C,R).

logic(A+B+A,R):-
	logic(A+B,R).

%if nothing matches then
logic( A , A ).
