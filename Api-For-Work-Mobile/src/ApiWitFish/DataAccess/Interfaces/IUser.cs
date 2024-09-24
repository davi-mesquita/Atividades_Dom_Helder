using ApiWitFish.Model;
using Refit;

namespace ApiWitFish.DataAccess.Interfaces
{
    public interface IUser
    {
        [Get("/user/{id}")]
        Task<User> GetUserById(int id);
    }
}