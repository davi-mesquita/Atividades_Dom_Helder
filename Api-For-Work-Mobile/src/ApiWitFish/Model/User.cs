using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ApiWitFish.Model
{
    public class User
    {
        public int Id { get; set; }
        public required string Nome { get; set; }
        public required string Senha { get; set; }
        public required string Email { get; set; }
        public DateTime CreateDate { get; set; }

    }
}