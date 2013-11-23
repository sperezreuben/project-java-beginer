using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace MyFirstWebApi.Models
{
    public class Contact
    {
        public int ContactId { get; set; }

        [Required]
        public string Name { get; set; }
    }
}