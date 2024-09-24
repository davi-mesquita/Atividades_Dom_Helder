using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ApiWitFish.Model
{
    public class Fish
    {
        public int Id { get; set; }
        public required string Nome { get; set; }
        public required string Descricao { get; set; }
        public required string Local { get; set; }
        public required int Avaliacao { get; set; }
        public DateTime CreateDate { get; set; }
    }
}