using Microsoft.EntityFrameworkCore;
using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.AspNetCore.Identity;

namespace ApiWitFish.Data
{
  public class DataContext : IdentityDbContext
  {
    public DataContext(DbContextOptions<DataContext> options) : base(options)
    {

    }
  }

}