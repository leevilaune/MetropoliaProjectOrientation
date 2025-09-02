### Task 1
a) Arrival event needs to generate a new arrival event so the simulation
keeps running. The simulation gets a new event from the event list and without
new arrival event the simulation stops running after handling the 
initial arrival.

b) arrival event

### Task 4 – Three Phase Simulation

We continue the simulation from the example until the **first Y exits**.

---

### Time 15

| Phase | Router Queue | Router | Oper 1 queue | Oper 1 | Oper 2 queue | Oper 2 |
|-------|--------------|--------|---------------|--------|---------------|--------|
| A     | X3           | Idle   | Empty         | X2 (16)| Empty         | Y1 (18)|
| B     | X3           | Idle   | Empty         | X2 (16)| Empty         | Y1 (18)|
| C     | Empty        | X3 (16)| Empty         | X2 (16)| Empty         | Y1 (18)|

Event List:

| Event | Time |
|-------|------|
| B4    | 16   |
| B3    | 16   |
| B5    | 18   |
| B1    | 20   |
| B2    | 20   |

Results:

| Work complete |   |
|---------------|---|
| X             | 1 |
| Y             | 0 |

---

### Time 16

| Phase | Router Queue | Router | Oper 1 queue | Oper 1 | Oper 2 queue | Oper 2 |
|-------|--------------|--------|---------------|--------|---------------|--------|
| A     | Empty        | X3 (16)| Empty         | X2 (16)| Empty         | Y1 (18)|
| B     | Empty        | Idle   | X3            | Idle   | Empty         | Y1 (18)|
| C     | Empty        | Idle   | Empty         | X3 (20)| Empty         | Y1 (18)|

Event List:

| Event | Time |
|-------|------|
| B5    | 18   |
| B1    | 20   |
| B2    | 20   |
| B4    | 20   |

Results:

| Work complete |   |
|---------------|---|
| X             | 2 |
| Y             | 0 |

---

### Time 18

| Phase | Router Queue | Router | Oper 1 queue | Oper 1 | Oper 2 queue | Oper 2 |
|-------|--------------|--------|---------------|--------|---------------|--------|
| A     | Empty        | Idle   | Empty         | X3 (20)| Empty         | Y1 (18)|
| B     | Empty        | Idle   | Empty         | X3 (20)| Empty         | Idle   |
| C     | Empty        | Idle   | Empty         | X3 (20)| Empty         | Idle   |

Event List:

| Event | Time |
|-------|------|
| B1    | 20   |
| B2    | 20   |
| B4    | 20   |

Results:

| Work complete |   |
|---------------|---|
| X             | 2 |
| Y             | 1 |

---

### Conclusion

The **first Y exits at time 18** (event `B5`).  
At this moment:
- Router is idle.
- Operator 1 is processing X3 (completes at 20).
- Operator 2 is idle.
- Results: **X=2, Y=1**.