### Solution178
    select score, 
           dense_rank() over(order by Score desc) as Rank
    from Scores;