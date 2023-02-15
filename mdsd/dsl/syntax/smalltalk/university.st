EntitySystemBuilder new
	name: 'University';
	entity: 'Person';
	entity: 'Student' with: [ :e | 
		e attribute: 'name' type: 'String'.
	];
	relation: 'Inheritance' from: 'Person' to: 'Student'.