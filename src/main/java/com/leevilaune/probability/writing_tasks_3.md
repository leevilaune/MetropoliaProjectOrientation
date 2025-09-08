### Task 1
Im dont know the actual ages of my classmates, so i asked chatgpt for 
mock data which goes as following:

| Age | Count |
|----|------|
|20|5|
|21|8|
|22|10|
|23|4|
|24|3|

That is mock data for 30 student class, from that we can
calculate probabilities for each age group with

$$
P = \frac{\text{size}}{\text{30}}
$$
For example
$$
P(20) = \frac{5}{30} \approx 0.17
$$
$$
P(21) = \frac{8}{30} \approx 0.27
$$
$$
P(22) = \frac{10}{30} \approx 0.33
$$
$$
P(23) = \frac{4}{30} \approx 0.13
$$
$$
P(24) = \frac{3}{30} = 0.1
$$

To use random numbers to get a random age based on the distribution
we want cumulative probability for each age

| Age |Probability|Cumulative|
|-----|----|----|
| 20  |0.17|0.17|
| 21  |0.27|0.44|
| 22  |0.33|0.77|
| 23  |0.13|0.9|
| 24  |0.1|1|

pseudocode for algorithm to get 1000 ages based on previously
established probabilities

```
dist = {
    {20, 0.17},
    {21, 0.44},
    {22, 0.77},
    {23, 0.90},
    {24, 1.00}
}
N = 1000
samples = array[N]

for k = 1 to N:
    u = random from 0 to 1
    for i = 0 to dist.length-1:
        if u <= dist[i][1]:
            samples[k] = dist[i][0]
            break
```

### Task 3
Singleton cant be initialized using the new keyword
because the constructor is declared as private

### Task 4
Normal distribution is shaped like a curve, highest concentration of values
is in the middle, for example daily temperature follows this distribution

Exponential distribution is ever-growing curve which is basically zero
at one end, can be used to model time to halve, such as the time caffeine 
takes to disappear from the body

Uniform, equal chance, no curves, for example rolling a dice or drawing names from
the wheel of fortune for who has to show tasks
